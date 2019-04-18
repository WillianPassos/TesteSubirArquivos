/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Massa;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import Massa.codigoLista ;
import java.util.Collections;

/**
 *
 * @author Cayo
 */
public class leitura extends codigoLista {

    public static void main(String[] Args) {

       
   
        
        try{
            FileInputStream fstream = new FileInputStream("C:/Users/Cayo/Documents/NetBeansProjects/ApsMassa/src/Massa/linhas.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            int codigo = 0;
            
            while ((strLine = br.readLine()) != null){
                
                
              strLine.valueOf(codigo);
           
                
               codigoLista.add(codigo, codigo);
                  
               
            }
            in.close();
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
                
                }
      
             
                 for (int i = 0; i < codigoLista.size(); i++) {
			System.out.println(codigoLista.get(i));
		}
       
                 Collections.shuffle(codigoLista);
                 
                 System.out.println("Embaralhado");
                    for(int i = 0; i < codigoLista.size(); i++){
                    System.out.println(codigoLista.get(i) );
        
            }
//        try {
//            codigoLista codigo = new codigoLista();
//            BufferedReader in = new BufferedReader(new FileReader("C://Users//Cayo//Documents//NetBeansProjects//ApsMassa//src//Massa//linhas.txt"));
//            String str;
//            while ((str = in.readLine()) != null) {
//                codigo.setCodigoLista(str);
//                
//            }
//            System.out.println(codigoLista);
//            
//            in.close();
//        } catch (IOException e) {
//             System.err.println("Error: " + e.getMessage());
//                
//                }
//      
//                
//                 for (int i = 0; i < codigoLista.size(); i++) {
//			System.out.println(codigoLista.getCodigoLista(i));
//		}
//       
//                 Collections.shuffle(codigoLista);
//                 
//                 System.out.println("Embaralhado");
//                    for(int i = 0; i < codigoLista.size(); i++){
//                    System.out.println(codigoLista.getCodigoLista());
//        
//            }
//        }
//
//    public leitura() {
//    }
//        
//    }
//
//
//}
    }

    public leitura(ArrayList<Integer> codigoLista) {
        super(codigoLista);
    }
        }
