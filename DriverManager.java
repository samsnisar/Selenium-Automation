package com.zohocrm.testscript;


import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;


@SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
public class DriverManager extends Keywords {
	static DriverManager dm=new DriverManager();
	static ArrayList data1;
	static FileInputStream f1;
	static XSSFWorkbook w1;
	static XSSFSheet s1;
	static{
	 try {
		 data1=new ArrayList();
		f1=new FileInputStream("E:\\shams\\shams.xlsx");
		w1=new XSSFWorkbook(f1);
		s1=w1.getSheet("Sheet1");
		
		Iterator<Row> rowitr1=s1.iterator();
		while(rowitr1.hasNext()) {
			Row rowall1=rowitr1.next();
			
			Iterator<Cell> cellitr1=rowall1.iterator();
			while(cellitr1.hasNext()) {
				Cell cellall1=cellitr1.next();
			
				if(cellall1.getCellTypeEnum()==CellType.STRING) {
                data1.add(cellall1.getStringCellValue());
					
				}
				if(cellall1.getCellTypeEnum()==CellType.NUMERIC) {
					data1.add(cellall1.getNumericCellValue());
					
				}
				if(cellall1.getCellTypeEnum()==CellType.BOOLEAN) {
					data1.add(cellall1.getBooleanCellValue());
				}
			}
		}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	 
		
	 }
	@SuppressWarnings({ "resource", "unused" })
	@Test
	public void main() {
		System.out.println(data1);
		for(int i=0; i<data1.size();i++) {
			if(data1.get(i).equals("Leads")&& data1.get(i+1).equals("yes")) {
				
				 try {
					 ArrayList data2=new ArrayList();
					 FileInputStream f2=new FileInputStream("E:\\shams\\Leads.xlsx");
					 XSSFWorkbook w2=new XSSFWorkbook(f2);
					 XSSFSheet s2=w2.getSheet("Sheet1");
					
					Iterator<Row> rowitr2=s2.iterator();
					while(rowitr2.hasNext()) {
						Row rowall2=rowitr2.next();
						
						Iterator<Cell> cellitr2=rowall2.iterator();
						while(cellitr2.hasNext()) {
							Cell cellall2=cellitr2.next();
						
							if(cellall2.getCellTypeEnum()==CellType.STRING) {
			                data2.add(cellall2.getStringCellValue());
								
							}
							if(cellall2.getCellTypeEnum()==CellType.NUMERIC) {
								data2.add(cellall2.getNumericCellValue());
								
							}
							if(cellall2.getCellTypeEnum()==CellType.BOOLEAN) {
								data2.add(cellall2.getBooleanCellValue());
							}
						}
					}
                       for (int j = 0; j < data2.size(); j++) {
                    	   if(data2.get(j).equals("openbrowser")) {
                    		   String Keywords=(String) data2.get(j);
                    		   String Testdata =(String) data2.get(j+1);
                    		   String objectName=(String) data2.get(j+2);
                    		   String Runmode=(String) data2.get(j+3);
                    		   
                    		//  System.out.println(Keywords+" "+Testdata+" "+Runmode);
                    		   if(Runmode.equals("yes")) {
                    		   dm.openbrowser();
                    		   }
                    	   }
                    	   if(data2.get(j).equals("navigate")) {
                    		   String Keywords=(String) data2.get(j);
                    		   String Testdata =(String) data2.get(j+1);
                    		   String objectName=(String) data2.get(j+2);
                    		   String Runmode=(String) data2.get(j+3);
                    		   
                    		 // System.out.println(Keywords+" "+Testdata+" "+Runmode);
                    		   if(Runmode.equals("yes")) {
                    		   dm.navigate(Testdata);
                    		   }
                    	   }
                    	   if(data2.get(j).equals("waitstatement")) {
                    		   String Keywords=(String) data2.get(j);
                    		   double Testdata =(double) data2.get(j+1);
                    		   String objectName=(String) data2.get(j+2);
                    		   String Runmode=(String) data2.get(j+3);
                    		   
                    		 // System.out.println(Keywords+" "+Testdata+" "+Runmode);
                    		   if(Runmode.equals("yes")) {
                    		   dm.waitstatement(Testdata);
                    		   }
                    	   }
                    	   if(data2.get(j).equals("input")) {
                    		   String Keywords=(String) data2.get(j);
                    		   String Testdata =(String) data2.get(j+1);
                    		   String objectName=(String) data2.get(j+2);
                    		   String Runmode=(String) data2.get(j+3);
                    		   
                    		 // System.out.println(Keywords+" "+Testdata+" "+Runmode);
                    		   if(Runmode.equals("yes")) {
                    		   dm.input(Testdata,objectName);
                    		   }
                    	   }
                    	   if(data2.get(j).equals("click")) {
                    		   String Keywords=(String) data2.get(j);
                    		   String Testdata =(String) data2.get(j+1);
                    		   String objectName=(String) data2.get(j+2);
                    		   String Runmode=(String) data2.get(j+3);
                    		   
                    		// System.out.println(Keywords+" "+Testdata+" "+Runmode);
                    		   if(Runmode.equals("yes")) {
                    		   dm.click(objectName);
                    		   }
                    	   }
                    	   if(data2.get(j).equals("type")) {
                    		   String Keywords=(String) data2.get(j);
                    		   String Testdata =(String) data2.get(j+1);
                    		   String objectName=(String) data2.get(j+2);
                    		   String Runmode=(String) data2.get(j+3);
                    		   
                    		// System.out.println(Keywords+" "+Testdata+" "+Runmode);
                    		   if(Runmode.equals("yes")) {
                    		   dm.type(Testdata);
                    		   }
                    	   }
                    	   
					}
					
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				 
				 
				 }
			
			
			
		}
	}
	}

