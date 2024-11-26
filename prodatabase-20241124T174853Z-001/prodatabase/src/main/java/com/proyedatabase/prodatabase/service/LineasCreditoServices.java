package com.proyedatabase.prodatabase.service;

import com.proyedatabase.prodatabase.modelo.LineaCredito;
import com.proyedatabase.prodatabase.repository.LineasCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import static org.springframework.data.util.ReflectionUtils.*;
import static org.springframework.data.util.ReflectionUtils.findField;

@Service
public class LineasCreditoServices {
    private final LineasCreditoRepository lineasCreditoRepository;

    public LineasCreditoServices(LineasCreditoRepository lineasCreditoRepository) {
        this.lineasCreditoRepository = lineasCreditoRepository;
    }

    public LineaCredito guardarLineasCredito(LineaCredito lc){
        return lineasCreditoRepository.save(lc);
    }



    public List<LineaCredito> consultarLineasCredito(){
        return lineasCreditoRepository.findAll();
    }

   /* public LineaCredito nobrelineaCredito(String nombre){

        return  lineasCreditoRepository.nombreCredito(nombre);
    }*/






}
