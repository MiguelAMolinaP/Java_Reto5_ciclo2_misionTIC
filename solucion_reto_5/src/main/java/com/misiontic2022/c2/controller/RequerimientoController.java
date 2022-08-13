/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic2022.c2.controller;

import com.misiontic2022.c2.model.dao.AsesorPorCiudadDao;
import com.misiontic2022.c2.model.dao.CompraPorProveedorDao;
import com.misiontic2022.c2.model.dao.ProyectoCasaCampestreDao;
import com.misiontic2022.c2.model.vo.AsesorPorCiudadVo;
import com.misiontic2022.c2.model.vo.CompraPorProveedorVo;
import com.misiontic2022.c2.model.vo.ProyectoCasaCampestreVo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class RequerimientoController {
   
    private final AsesorPorCiudadDao asesorPorCiudadDao;
    private final ProyectoCasaCampestreDao proyectoCasaCampestreDao;
    private final CompraPorProveedorDao compraPorProveedorDao;

    public RequerimientoController() {
        asesorPorCiudadDao = new AsesorPorCiudadDao();
        proyectoCasaCampestreDao = new ProyectoCasaCampestreDao();
        compraPorProveedorDao = new CompraPorProveedorDao();
    }


    public ArrayList<AsesorPorCiudadVo> consultarAsesorPorCiudad() throws SQLException{
        return asesorPorCiudadDao.listar();
    }

    public ArrayList<ProyectoCasaCampestreVo> consultarProyectoCasaCampestre() throws SQLException {
        return proyectoCasaCampestreDao.listar();
    }

    public ArrayList<CompraPorProveedorVo> consultarCompraPorProveedor() throws SQLException {
        return compraPorProveedorDao.listar();
    }

}
