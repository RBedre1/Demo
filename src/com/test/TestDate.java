package com.test;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class TestDate {

	public static void main(String[] args) {
		/*String str = "2021-06-12 17:59:59";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.parse(str, formatter);
		System.out.println(now);
//		LocalDateTime now = LocalDateTime.now();
		
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		System.out.println(now.getHour());
		if(dayOfWeek != DayOfWeek.SUNDAY) {
			if(now.getHour()>=10 && now.getHour()<=17)  {
				
				System.out.println("Its working hours");
			}
		}*/
		
		
		Employee e1 = new Employee();
		e1.setAge(1);
		e1.setId(4);
		e1.setName("yafc");

        Employee e2 = new Employee();
        
        e2.setAge(0);
		e2.setId(0);
		e2.setName(null);
       System.out.println(isObjectEquals(e1,e2));
        
//        boolean b;
//		try {
//			b = BeanUtil.haveSamePropertyValues(Employee.class, e1, e2);
//			System.out.println(b);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        	}
	
		public static boolean isObjectEquals(Object obj1 , Object obj2) {
			 if (obj1 == obj2) return true;
			 if (obj1 == null || obj2 == null || obj1.getClass() != obj2.getClass()) return false;
			 Employee employee1 = (Employee) obj1;
			 Employee employee2 = (Employee) obj2;
			 return  employee1.getId() == employee2.getId() &&
					 employee1.getAge() == employee2.getAge() &&
		                Objects.equals(employee1.getName(), employee2.getName());
			
		}
	}
