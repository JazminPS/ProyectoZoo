/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author beatl
 */
public class Sql extends Conexion {

    private static String sql;
    private static Connection con;
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static ResultSetMetaData rsmd;

    public static boolean registrarVeterinario(Veterinario vet) {
        try {

            sql = "INSERT INTO veterinario (VET_cedula,VET_correo,VET_telefono,VET_nombre,VET_nombre2,VET_apellido1,VET_apellido2) VALUES (?,?,?,?,?,?,?)";
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, vet.getCedulaProfesional());
            ps.setString(2, vet.getCorreo());
            ps.setString(3, vet.getTelefono());
            ps.setString(4, vet.getNombre());
            if (vet.getNombre2().equals("")) {
                ps.setNull(5, 0);
            } else {
                ps.setString(5, vet.getNombre2());
            }

            ps.setString(6, vet.getApellido1());
            ps.setString(7, vet.getApellido2());

            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static int verUltAnimal() {

        try {
            sql = "SELECT MAX(ANI_AnimalID) as Id FROM Animal ";
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                i = rs.getInt(1);
            }

            return i;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
            System.out.println(e);
            System.out.println("Error al obtener ID");
            return 0;
        }
    }

    public static boolean registrarAnimal(Animal ani) {
        try {

            sql = "INSERT INTO animal (ANI_CuidadorID,ANI_HabitatID,ANI_Nombre,ANI_Alimentacion,ANI_Anyo_cautiverio,ANI_Especie,ANI_Sexo,ANI_Edad,ANI_Peso,ANI_Observaciones) VALUES (?,?,?,?,?,?,?,?,?,?)";
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ani.getIdCuidador());
            ps.setInt(2, ani.getIdHabitat());
            ps.setString(3, ani.getNombre());
            ps.setString(4, ani.getAlimentacion());
            ps.setInt(5, ani.getAnyoCautiverio());
            ps.setString(6, ani.getEspecie());
            ps.setString(7, ani.getSexo());
            ps.setInt(8, ani.getEdad());
            ps.setFloat(9, ani.getPeso());
            ps.setString(10, ani.getObservaciones());
            ps.execute();
            ps.close();
            con.close();
            ani.setId(verUltAnimal());
            switch (ani.getProcedencia()) {
                case 1:
                    sql = "INSERT INTO Procedencia_Local (LOC_AnimalID, LOC_VeterinarioID, LOC_Fecha_nacimiento, LOC_Peso_nacimiento) values (?,?,?,?)";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    ps.setInt(1, ani.getId());
                    ps.setInt(2, ani.getIdVeterinario());
                    ps.setDate(3, ani.getFechaNacimiento());
                    ps.setFloat(4, ani.getPeso());
                    ps.execute();

                    break;
                case 2:
                    sql = "INSERT INTO Procedencia_Rescate (RES_AnimalID, RES_Edad_rescate, RES_Condicion, RES_Fecha_rescate) values (?,?,?,?)";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    ps.setInt(1, ani.getId());
                    ps.setInt(2, ani.getEdad());
                    ps.setString(3, ani.getCondicion());
                    ps.setDate(4, ani.getFechaRescate());
                    ps.execute();

                    break;
                case 3:
                    sql = "INSERT INTO Procedencia_Foranea (FOR_AnimalID,FOR_Nom_zoo,FOR_Fecha_traslado) values (?,?,?)";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    ps.setInt(1, ani.getId());
                    ps.setString(2, ani.getNombreZoologico());
                    ps.setDate(3, ani.getFechaTraslado());
                    ps.execute();

                    break;
                default:
                    break;
            }

            ps.close();
            con.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static ArrayList<Cuidador> verCuidadores() {
        ArrayList<Cuidador> cuidadores = new ArrayList<>();
        Cuidador c = new Cuidador();
        try {
            sql = "SELECT * FROM cuidador order by CUI_nombre";
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                c = new Cuidador();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setNombre2(rs.getString(3));
                if (rs.wasNull()) {
                    c.setNombre2("");
                }
                c.setApellido1(rs.getString(4));
                c.setApellido2(rs.getString(5));
                c.setSueldo(rs.getFloat(6));
                cuidadores.add(c);

            }

            return cuidadores;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
            System.out.println(e);
            return cuidadores;
        }
    }

    public static ArrayList<Cuidador> verCuidadores(int sel) {
        ArrayList<Cuidador> cuidadores = new ArrayList<>();
        Cuidador c = new Cuidador();
        try {
            sql = "SELECT * FROM cuidadoresdisponibles order by CUI_nombre";
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                c = new Cuidador();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setNombre2(rs.getString(3));
                if (rs.wasNull()) {
                    c.setNombre2("");
                }
                c.setApellido1(rs.getString(4));
                c.setApellido2(rs.getString(5));
                c.setSueldo(rs.getFloat(6));
                cuidadores.add(c);

            }

            return cuidadores;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
            System.out.println(e);
            return cuidadores;
        }
    }

    public static ArrayList<Veterinario> verVeterinarios() {
        ArrayList<Veterinario> veterinarios = new ArrayList<>();
        Veterinario v = new Veterinario();
        try {
            sql = "SELECT * FROM veterinario";
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                v = new Veterinario();
                v.setId(rs.getInt(1));
                v.setNombre(rs.getString(2));
                v.setNombre2(rs.getString(3));
                if (rs.wasNull()) {
                    v.setNombre2("");
                }
                v.setApellido1(rs.getString(4));
                v.setApellido2(rs.getString(5));
                v.setCorreo(rs.getString(6));
                v.setCedulaProfesional(rs.getString(7));
                v.setTelefono(rs.getString(8));
                veterinarios.add(v);
            }

            return veterinarios;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
            System.out.println(e);
            return veterinarios;
        }
    }

    public static ArrayList<Animal> verAnimales(String selector, int sel) {

        ArrayList<Animal> animales = new ArrayList<>();
        Animal a = new Animal();
        switch (selector) {
            case "todos":
                try {
                    sql = "select * from verAnimales";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        a = new Animal();
                        a.setId(rs.getInt(1));
                        a.setNombreCuidador(rs.getString(2));
                        a.setNombreHabitat(rs.getString(3));
                        a.setNombre(rs.getString(4));
                        a.setAlimentacion(rs.getString(5));
                        a.setAnyoCautiverio(rs.getInt(6));
                        a.setEspecie(rs.getString(7));
                        a.setSexo(rs.getString(8));
                        a.setEdad(rs.getInt(9));
                        a.setPeso(rs.getFloat(10));
                        a.setObservaciones(rs.getString(11));
                        animales.add(a);
                        a = null;
                    }
                    return animales;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error de consulta");
                    System.out.println(e);
                    return animales;
                }

            default:
                if (sel == 2) {
                    try {
                        sql = "call filtroAnimales(?)";
                        con = getConnection();
                        CallableStatement sp = con.prepareCall(sql);
                        sp.setString(1, selector);
                        sp.execute();
                        rs = sp.getResultSet();

                        while (rs.next()) {
                            a = new Animal();
                            a.setId(rs.getInt(1));
                            a.setNombreCuidador(rs.getString(2));
                            a.setNombreHabitat(rs.getString(3));
                            a.setNombre(rs.getString(4));
                            a.setAlimentacion(rs.getString(5));
                            a.setAnyoCautiverio(rs.getInt(6));
                            a.setEspecie(rs.getString(7));
                            a.setSexo(rs.getString(8));
                            a.setEdad(rs.getInt(9));
                            a.setPeso(rs.getFloat(10));
                            a.setObservaciones(rs.getString(11));
                            animales.add(a);
                            a = null;
                        }
                        return animales;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error de consulta");
                        System.out.println(e);
                        return animales;
                    }
                } else {
                    try {
                        sql = "call filtroAnimalesEspecie(?)";
                        con = getConnection();
                        CallableStatement sp = con.prepareCall(sql);
                        sp.setString(1, selector);
                        sp.execute();
                        rs = sp.getResultSet();

                        while (rs.next()) {
                            a = new Animal();
                            a.setId(rs.getInt(1));
                            a.setNombreCuidador(rs.getString(2));
                            a.setNombreHabitat(rs.getString(3));
                            a.setNombre(rs.getString(4));
                            a.setAlimentacion(rs.getString(5));
                            a.setAnyoCautiverio(rs.getInt(6));
                            a.setEspecie(rs.getString(7));
                            a.setSexo(rs.getString(8));
                            a.setEdad(rs.getInt(9));
                            a.setPeso(rs.getFloat(10));
                            a.setObservaciones(rs.getString(11));
                            animales.add(a);
                            a = null;
                        }
                        return animales;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error de consulta");
                        System.out.println(e);
                        return animales;
                    }
                }

        }
    }

    public static ArrayList<Habitat> verHabitat() {
        ArrayList<Habitat> habitats = new ArrayList<>();
        Habitat h = new Habitat();
        try {
            sql = "SELECT * FROM Habitat";
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                h = new Habitat();
                h.setId(rs.getInt(1));
                h.setClimaId(rs.getInt(2));
                h.setCuidadorId(rs.getInt(3));
                h.setNombre(rs.getString(4));
                h.setDisponibilidad(rs.getString(5));

                habitats.add(h);
            }

            return habitats;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
            System.out.println(e);
            return habitats;
        }
    }

    public static ArrayList<RegistroONG> verActividades() {
        ArrayList<RegistroONG> actividades = new ArrayList<>();
        RegistroONG r = new RegistroONG();
        try {
            sql = "SELECT * FROM Registro_ONG";
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                r = new RegistroONG();
                r.setActividadId(rs.getInt(1));
                r.setAprobacion(rs.getString(2));
                r.setOngNombre(rs.getString(3));
                r.setNombreActividad(rs.getString(4));
                r.setDescripcionActividad(rs.getString(5));
                r.setFechaSolicitud(rs.getDate(6));
                r.setHoraApertura(rs.getString(7));
                r.setHoraCierre(rs.getString(8));
                r.setHabitatId(rs.getInt(9));

                actividades.add(r);
            }

            return actividades;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
            System.out.println(e);
            return actividades;
        }
    }

    public static boolean registrarActividad(RegistroONG rong, Habitat ht) {
        long d = rong.getFechaSolicitud().getTime();
        java.sql.Date FechaSolicitud = new java.sql.Date(d);

        if (verActividades().isEmpty()) {
            rong.setActividadId(1);
        } else {
            rong.setActividadId((verActividades().get(verActividades().size() - 1).getActividadId()) + 1);
        }

        try {
            //SE REALIZA LA INSERCION DE LOS DIFERENTES DATOS EN LA TABLA REGISTRO_ONG
            sql = "INSERT INTO Registro_ONG (REG_ActividadID,REG_Aprobacion,REG_Ong_nombre,REG_Nombre_actividad,REG_Desc_actividad,REG_Fecha_solicitud,REG_Hora_apertura,REG_Hora_cierre,REG_HabitatID) VALUES (?,?,?,?,?,?,?,?,?)";
            con = getConnection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, rong.getActividadId());
            ps.setString(2, rong.getAprobacion());
            ps.setString(3, rong.getOngNombre());
            ps.setString(4, rong.getNombreActividad());
            ps.setString(5, rong.getDescripcionActividad());
            ps.setDate(6, FechaSolicitud);
            ps.setString(7, rong.getHoraApertura());
            ps.setString(8, rong.getHoraCierre());
            ps.setInt(9, rong.getHabitatId());
            ps.execute();

            //REALIZANDO EL ALTA DE LOS DIAS DE LA ACTIVIDAD Y EL ID DE LA ACTIVIDAD
            //EN LA TABLA ONG_REALIZA
            sql = "INSERT INTO ONG_Realiza (REA_ActividadID,REA_Dia) VALUES (?,?)";
            con = getConnection();
            ps = con.prepareStatement(sql);

            for (int i = 0; i < ht.getDiasActividad().size(); i++) {
                ps.setInt(1, rong.getActividadId());
                ps.setString(2, ht.getDiasActividad().get(i));
                ps.execute();
            }

            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public static UltimosRegistros ultimaVisitaMedica(UltimosRegistros ur) {

        try {
            sql = " select * from ultimaVisita";
            con = getConnection();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {

                ur.setNombreVeterinario(rs.getString(1));
                ur.setApellido1Veterinario(rs.getString(2));
                ur.setApellido2Veterinario(rs.getString(3));
                ur.setNombreAnimal(rs.getString(4));
                ur.setFechaRevision(rs.getDate(5));
            }
            return ur;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
            ur.setNombreVeterinario("");
            ur.setApellido1Veterinario("");
            ur.setApellido2Veterinario("");
            ur.setNombreAnimal("");
            ur.setFechaRevision(new java.sql.Date(0));
            return ur;
        }

    }

    public static UltimosRegistros ultimoRegistroTempHum(UltimosRegistros ur) {
        try {
            sql = "select * from ultimoRegistro";
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ur.setTemperatura(rs.getFloat(1));
                ur.setHumedad(rs.getFloat(2));
                ur.setNombreHabitat(rs.getString(3));
                ur.setFechaRegistro(rs.getDate(4));
            }
            return ur;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
            ur.setTemperatura(0);
            ur.setHumedad(0);
            ur.setNombreHabitat("");
            ur.setFechaRegistro(new java.sql.Date(0));
            return ur;
        }

    }

    public static UltimosRegistros ultimaActividad(UltimosRegistros ur) {

        try {
            sql = "select * from ultimaActividad";
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ur.setNombreActividad(rs.getString(1));
                ur.setNombreONG(rs.getString(2));
                ur.setNombreActHabitat(rs.getString(4));
            }

            return ur;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
            ur.setNombreActividad("");
            ur.setNombreONG("");
            ur.setNombreActHabitat("");
            return ur;
        }
    }

    public static ArrayList<Animal> verAnimales() {
        ArrayList<Animal> animales = new ArrayList<>();
        Animal a = new Animal();
        try {
            sql = "SELECT * FROM Animal";
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                a = new Animal();
                a.setId(rs.getInt(1));
                a.setIdCuidador(rs.getInt(2));
                a.setIdHabitat(rs.getInt(3));
                a.setNombre(rs.getString(4));
                a.setAlimentacion(rs.getString(5));
                a.setAnyoCautiverio(rs.getInt(6));
                a.setEspecie(rs.getString(7));
                a.setSexo(rs.getString(8));
                a.setEdad(rs.getInt(9));
                a.setPeso(rs.getFloat(10));
                a.setObservaciones(rs.getString(11));

                animales.add(a);
            }

            return animales;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
            System.out.println(e);
            return animales;
        }
    }

    public static boolean reporteVisitaMedica(RevisaAnimal ra) {
        long d = ra.getFechaRevision().getTime();
        java.sql.Date FechaRevision = new java.sql.Date(d);

        try {
            sql = "INSERT INTO Revisa_Animal (REV_VeterinarioID, REV_AnimalID, REV_Observaciones, REV_Fecha_Revision) VALUES (?,?,?,?)";
            con = getConnection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, ra.getVeterinarioId());
            ps.setInt(2, ra.getAnimalId());
            ps.setString(3, ra.getObservaciones());
            ps.setDate(4, FechaRevision);

            ps.execute();
            ps.close();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }

    }

    public static ArrayList<String> filtros(int selectedFiltro) {
        ArrayList<String> opciones = new ArrayList<>();
        switch (selectedFiltro) {
            case 1:
                try {
                    sql = "select distinct(ANI_especie) from Animal";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        opciones.add(rs.getString(1));
                    }

                    return opciones;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error de consulta");
                    return opciones;
                }
            case 2:
                try {

                    sql = "select distinct(HAB_nombre) from Habitat";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        opciones.add(rs.getString(1));
                    }
                    return opciones;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error de consulta");
                    return opciones;
                }
            default:
                return opciones;
        }
    }

    public static boolean registrarCuidadores(Cuidador c) {
        try {
            sql = "insert into Cuidador (CUI_nombre,CUI_nombre2,CUI_Apellido1,CUI_Apellido2,CUI_sueldo) values (?,?,?,?,?)";
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            if (c.getNombre2().equals("")) {
                ps.setNull(2, 0);
            } else {
                ps.setString(2, c.getNombre2());
            }
            ps.setString(3, c.getApellido1());
            ps.setString(4, c.getApellido2());
            ps.setFloat(5, c.getSueldo());
            ps.execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro Fallido");
            return false;
        }

    }

    public static ArrayList<Clima> verClimas() {
        ArrayList<Clima> climas = new ArrayList<>();
        Clima c;
        try {
            sql = "select * from clima";
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                c = new Clima();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                climas.add(c);
            }
            return climas;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Fallido");
            return climas;
        }
    }

    public static boolean registrarHabitat(Habitat h) {
        try {
            sql = "insert into habitat (HAB_ClimaId, HAB_CuidadorId,HAB_Nombre,HAB_Disponibilidad) values (?,?,?,?)";
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, h.getClimaId());
            ps.setInt(2, h.getCuidadorId());
            ps.setString(3, h.getNombre());
            ps.setString(4, h.getDisponibilidad());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static ArrayList<Habitats> verHabitats() {
        ArrayList<Habitats> habitats = new ArrayList<>();
        Habitats h;
        try {
            sql = "select * from verHabitats";
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                h = new Habitats();
                h.setNombreHabitat(rs.getString(1));
                h.setNombreCuidador(rs.getString(2));
                h.setApellidoCuidador(rs.getString(3));
                h.setClima(rs.getString(4));
                h.setId(rs.getInt(5));
                habitats.add(h);

            }
            return habitats;
        } catch (Exception e) {
            return habitats;
        }
    }

    public static ArrayList<UltimosRegistros> verRegistrosHabitats(String Habitat) {
        ArrayList<UltimosRegistros> ultReg = new ArrayList<>();
        UltimosRegistros ultimos;
        try {
            sql = "call verRegistrosHabitats(?)";
            con = getConnection();
            CallableStatement sp = con.prepareCall(sql);
            sp.setString(1, Habitat);
            sp.execute();
            rs = sp.getResultSet();
            while (rs.next()) {
                ultimos = new UltimosRegistros();
                ultimos.setTemperatura(rs.getFloat(1));
                ultimos.setHumedad(rs.getFloat(2));
                ultimos.setFechaRegistro(rs.getDate(3));
                ultReg.add(ultimos);
            }
            return ultReg;
        } catch (Exception e) {
            return ultReg;
        }

    }

    public static ArrayList<String> OpcionesActividades(int opcion) {
        ArrayList<String> opciones = new ArrayList<>();

        switch (opcion) {
            case 1:
                try {
                    sql = "select distinct rea_dia from ong_realiza";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        opciones.add(rs.getString(1));
                    }
                    return opciones;
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error de consulta");
                    return opciones;
                }

            case 2:
                try {
                    sql = "select distinct hab_nombre from habitat";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        opciones.add(rs.getString(1));
                    }

                    return opciones;
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error de consulta");
                    return opciones;
                }

            case 3:
                try {
                    sql = "select distinct reg_aprobacion from registro_ong";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        opciones.add(rs.getString(1));
                    }
                    return opciones;
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error de consulta");
                    return opciones;
                }

            default:
                return opciones;
        }
    }

    public static ArrayList<RegistroONG> llamarActividades(String seleccion, int indice) {
        ArrayList<RegistroONG> actividades = new ArrayList<>();
        RegistroONG r = new RegistroONG();
        switch (seleccion) {
            case "todos":
                try {
                    sql = "select * from actividades";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        r = new RegistroONG();
                        r.setAprobacion(rs.getString(1));
                        r.setOngNombre(rs.getString(2));
                        r.setNombreActividad(rs.getString(3));
                        r.setDescripcionActividad(rs.getString(4));
                        r.setFechaSolicitud(rs.getDate(5));
                        r.setHoraApertura(rs.getString(6));
                        r.setHoraCierre(rs.getString(7));
                        r.setNombreHabitat(rs.getString(8));

                        actividades.add(r);
                    }
                    return actividades;

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error de consulta");
                    return actividades;
                }
            default:
                if (indice == 1) {
                    try {
                        sql = "call filtroDiasActividad(?)";
                        con = getConnection();
                        CallableStatement sp = con.prepareCall(sql);
                        sp.setString(1, seleccion);
                        sp.execute();
                        rs = sp.executeQuery();

                        while (rs.next()) {
                            r = new RegistroONG();
                            r.setAprobacion(rs.getString(1));
                            r.setOngNombre(rs.getString(2));
                            r.setNombreActividad(rs.getString(3));
                            r.setDescripcionActividad(rs.getString(4));
                            r.setFechaSolicitud(rs.getDate(5));
                            r.setHoraApertura(rs.getString(6));
                            r.setHoraCierre(rs.getString(7));
                            r.setNombreHabitat(rs.getString(8));

                            actividades.add(r);
                        }

                        return actividades;
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error de consulta");
                        return actividades;
                    }
                } else if (indice == 2) {
                    try {
                        sql = "call filtroHabitatActividad(?)";
                        con = getConnection();
                        CallableStatement sp = con.prepareCall(sql);
                        sp.setString(1, seleccion);
                        sp.execute();
                        rs = sp.executeQuery();

                        while (rs.next()) {
                            r = new RegistroONG();
                            r.setAprobacion(rs.getString(1));
                            r.setOngNombre(rs.getString(2));
                            r.setNombreActividad(rs.getString(3));
                            r.setDescripcionActividad(rs.getString(4));
                            r.setFechaSolicitud(rs.getDate(5));
                            r.setHoraApertura(rs.getString(6));
                            r.setHoraCierre(rs.getString(7));
                            r.setNombreHabitat(rs.getString(8));

                            actividades.add(r);
                        }

                        return actividades;
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error de consulta");
                        return actividades;
                    }

                } else if (indice == 3) {
                    try {
                        sql = "call filtroStatus(?)";
                        con = getConnection();
                        CallableStatement sp = con.prepareCall(sql);
                        sp.setString(1, seleccion);
                        sp.execute();
                        rs = sp.executeQuery();

                        while (rs.next()) {
                            r = new RegistroONG();
                            r.setAprobacion(rs.getString(1));
                            r.setOngNombre(rs.getString(2));
                            r.setNombreActividad(rs.getString(3));
                            r.setDescripcionActividad(rs.getString(4));
                            r.setFechaSolicitud(rs.getDate(5));
                            r.setHoraApertura(rs.getString(6));
                            r.setHoraCierre(rs.getString(7));
                            r.setNombreHabitat(rs.getString(8));
                            actividades.add(r);
                        }

                        return actividades;
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error de consulta");
                        return actividades;
                    }
                } else {
                    return actividades;
                }
        }
    }

    public static boolean eliminarActividad(RegistroONG rong) {
        try {
            sql = "delete from registro_ong where reg_nombre_actividad = ?";
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, rong.getNombreActividad());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public static boolean registroTempHum(Registra r) {
        Clima c = new Clima();
        try {
            sql = "call validacionRegistro(?)";
            con = getConnection();
            CallableStatement sp = con.prepareCall(sql);
            sp.setInt(1, r.getHabitatId());
            sp.execute();
            rs = sp.executeQuery();

            while (rs.next()) {

                c.setHumedadMin(rs.getInt(1));
                c.setHumedadMax(rs.getInt(2));
                c.setTemperaturaMin(rs.getInt(3));
                c.setTemperaturaMax(rs.getInt(4));
            }
            System.out.println(c.getHumedadMax());
            System.out.println(c.getHumedadMin());
            if (r.getHumedad() < c.getHumedadMin()) {
                JOptionPane.showMessageDialog(null, "Humedad no valida");
                return false;
            } else if (r.getHumedad() > c.getHumedadMax()) {
                JOptionPane.showMessageDialog(null, "Humedad no valida");
                return false;
            } else if (r.getTemperatura() < c.getTemperaturaMin()) {
                JOptionPane.showMessageDialog(null, "Temperatura no valida");
                return false;
            } else if (r.getTemperatura() > c.getTemperaturaMax()) {
                JOptionPane.showMessageDialog(null, "Temperatura no valida");
                return false;
            }

            sql = "insert into Registra (RHA_HabitatID, RHA_Temperatura, RHA_Humedad, RHA_Fecha_registro) values (?,?,?,?)";
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, r.getHabitatId());
            ps.setFloat(2, r.getTemperatura());
            ps.setFloat(3, r.getHumedad());
            ps.setTimestamp(4, new java.sql.Timestamp(Calendar.getInstance().getTimeInMillis()));
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static boolean actualizarVeterinario(Veterinario v) {
        try {
            sql = "update Veterinario set vet_nombre = ?, vet_apellido1 = ?, vet_apellido2 = ?, vet_correo = ?,vet_cedula = ?, vet_telefono = ?, vet_nombre2 = ? where vet_veterinarioid = ?";
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getNombre());
            ps.setString(2, v.getApellido1());
            ps.setString(3, v.getApellido2());
            ps.setString(4, v.getCorreo());
            ps.setString(5, v.getCedulaProfesional());
            ps.setString(6, v.getTelefono());
            if(v.getNombre2().equals(""))
                ps.setNull(7, 0);
            else
                ps.setString(7, v.getNombre2());
            ps.setInt(8, v.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static boolean actualizarCuidador(Cuidador c) {
        try {
            sql = "update cuidador set CUI_nombre = ?, CUI_nombre2 = ?, CUI_apellido1 = ?, CUI_apellido2 = ?, CUI_sueldo = ? where CUI_CuidadorId = ?";
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            if (c.getNombre2().equals("")) {
                ps.setNull(2, 0);
            } else {
                ps.setString(2, c.getNombre2());
            }
            ps.setString(3, c.getApellido1());
            ps.setString(4, c.getApellido2());
            ps.setFloat(5, c.getSueldo());
            ps.setInt(6, c.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static boolean actualizarHabitat(Habitat h) {
        try {
            sql = "update habitat set HAB_nombre = ?, HAB_climaId = ? where HAB_HabitatId = ?";
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, h.getNombre());
            ps.setInt(2, h.getClimaId());
            ps.setInt(3, h.getId());
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static ArrayList<String> filtroVisitas(int opcion) {
        ArrayList<String> lista = new ArrayList<>();

        switch (opcion) {
            case 1:
                try {
                    sql = "select distinct ani_especie from animal";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        lista.add(rs.getString(1));
                    }
                    return lista;
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error de consulta");
                    return lista;
                }

            case 2:
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaDate = null;
                try {
                    sql = "select distinct rev_fecha_revision from revisa_animal";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        try {
                            fechaDate = sdf.parse(rs.getString(1));
                            lista.add(sdf2.format(fechaDate));
                        } catch (ParseException ex) {
                            System.out.println(ex);
                        }
                    }
                    return lista;
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error de consulta");
                    return lista;
                }

            default:
                return lista;

        }
    }

    public static ArrayList<RevisaAnimal> verVisitas(String seleccion, int indice) {
        ArrayList<RevisaAnimal> revisiones = new ArrayList<>();
        RevisaAnimal ra = new RevisaAnimal();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        switch (seleccion) {
            case "todos":
                try {
                    sql = "select * from VisitasMedicas";
                    con = getConnection();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        ra = new RevisaAnimal();
                        ra.setNombreVeterinario(rs.getString(1));
                        ra.setNombre2Veterinario(rs.getString(2));
                        ra.setApellidoVeterinario(rs.getString(3));
                        ra.setApellidoVeterinario(rs.getString(4));
                        ra.setNombreAnimal(rs.getString(5));
                        ra.setEspecieAnimal(rs.getString(6));
                        ra.setPesoAnimal(rs.getFloat(7));
                        ra.setObservaciones(rs.getString(8));

                        try {
                            fechaDate = sdf.parse(rs.getString(9));
                            ra.setFechaRevision(fechaDate);
                        } catch (ParseException ex) {
                            System.out.println(ex);
                        }

                        revisiones.add(ra);
                    }
                    return revisiones;

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error de consulta");
                    return revisiones;
                }
            default:
                if (indice == 1) {
                    try {
                        sql = "call filtroEspecieVisitas(?)";
                        con = getConnection();
                        CallableStatement sp = con.prepareCall(sql);
                        sp.setString(1, seleccion);
                        sp.execute();
                        rs = sp.executeQuery();

                        while (rs.next()) {
                            ra = new RevisaAnimal();
                            ra.setNombreVeterinario(rs.getString(1));
                            ra.setNombre2Veterinario(rs.getString(2));
                            ra.setApellidoVeterinario(rs.getString(3));
                            ra.setApellidoVeterinario(rs.getString(4));
                            ra.setNombreAnimal(rs.getString(5));
                            ra.setEspecieAnimal(rs.getString(6));
                            ra.setPesoAnimal(rs.getFloat(7));
                            ra.setObservaciones(rs.getString(8));
                            try {
                                fechaDate = sdf.parse(rs.getString(9));
                                ra.setFechaRevision(fechaDate);
                            } catch (ParseException ex) {
                                System.out.println(ex);
                            }

                            revisiones.add(ra);
                        }

                        return revisiones;
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error de consulta");
                        return revisiones;
                    }
                } else if (indice == 2) {
                    try {
                        sql = "call filtroFechasRevision(?)";
                        con = getConnection();
                        CallableStatement sp = con.prepareCall(sql);
                        Date fecha = null;
                        try {
                            fecha = sdf2.parse(seleccion);
                            ra.setFechaRevision(fechaDate);
                        } catch (ParseException ex) {
                            System.out.println(ex);
                        }

                        long d = fecha.getTime();
                        java.sql.Date FechaNueva = new java.sql.Date(d);

                        sp.setDate(1, FechaNueva);
                        sp.execute();
                        rs = sp.executeQuery();

                        while (rs.next()) {
                            ra = new RevisaAnimal();
                            ra.setNombreVeterinario(rs.getString(1));
                            ra.setNombre2Veterinario(rs.getString(2));
                            ra.setApellidoVeterinario(rs.getString(3));
                            ra.setApellidoVeterinario(rs.getString(4));
                            ra.setNombreAnimal(rs.getString(5));
                            ra.setEspecieAnimal(rs.getString(6));
                            ra.setPesoAnimal(rs.getFloat(7));
                            ra.setObservaciones(rs.getString(8));
                            try {
                                fechaDate = sdf.parse(rs.getString(9));
                                ra.setFechaRevision(fechaDate);
                            } catch (ParseException ex) {
                                System.out.println(ex);
                            }

                            revisiones.add(ra);
                        }

                        return revisiones;
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error de consulta");
                        return revisiones;
                    }

                } else {
                    return revisiones;
                }
        }
    }

    public static ArrayList<RevisaAnimal> verVisitaVeterinario(int id) {
        ArrayList<RevisaAnimal> revisiones = new ArrayList<>();
        RevisaAnimal ra = new RevisaAnimal();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            sql = "call filtroVeterinarioVisitas(?)";
            con = getConnection();
            CallableStatement sp = con.prepareCall(sql);
            sp.setInt(1, id);
            sp.execute();
            rs = sp.executeQuery();

            while (rs.next()) {
                ra = new RevisaAnimal();
                ra.setNombreVeterinario(rs.getString(1));
                ra.setNombre2Veterinario(rs.getString(2));
                ra.setApellidoVeterinario(rs.getString(3));
                ra.setApellidoVeterinario(rs.getString(4));
                ra.setNombreAnimal(rs.getString(5));
                ra.setEspecieAnimal(rs.getString(6));
                ra.setPesoAnimal(rs.getFloat(7));
                ra.setObservaciones(rs.getString(8));
                try {
                    fechaDate = sdf.parse(rs.getString(9));
                    ra.setFechaRevision(fechaDate);
                } catch (ParseException ex) {
                    System.out.println(ex);
                }

                revisiones.add(ra);
            }

            return revisiones;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
            return revisiones;
        }

    }
}
