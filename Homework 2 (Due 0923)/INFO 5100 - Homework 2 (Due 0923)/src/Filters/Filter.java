/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filters;
import Business.Airplane;
import java.util.ArrayList;
/**
 *
 * @author Wenqing
 */


public abstract class Filter {    
    public abstract ArrayList<Airplane> sort(ArrayList<Airplane> list);
    } 