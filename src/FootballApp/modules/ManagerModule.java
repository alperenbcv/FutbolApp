package FootballApp.modules;

import FootballApp.databases.ManagerDB;
import FootballApp.entities.Manager;

public class ManagerModule {
	public static void addManager(ManagerDB managerDB){
		Manager manager1 = new Manager("Jose Mourinho", 61, "Portekiz", "mourinho", "1234");
		Manager manager2 = new Manager("Okan Buruk",50,"Istanbul","okan","1234");
		Manager manager3 = new Manager("Giovanni van Bronckhorst",49,"Hollanda","giovanni","1234");
		Manager manager4 = new Manager("Abdullah Avci",61,"Istanbul","abdullah","1234");
		Manager manager5 = new Manager("Cagdas Atan",44,"Istanbul","cagdas","6783");
		Manager manager6 = new Manager("İlhan Palut",47,"Hatay","ilhan","5214");
		Manager manager7 = new Manager("Thomas Reis",50,"Almanya","thomas","4325");
		Manager manager8 = new Manager("Burak Yılmaz",39,"Antalya","burak","3675");
		Manager manager9 = new Manager("Arda Turan", 37, "Turkiye", "Arda", "9999");
		Manager manager10 = new Manager("Alex DeSouza",46,"Brazil","Alex","9876");
		Manager manager11 = new Manager("Michael Valkanis",40,"Avustralia","Michi","5432");
		Manager manager12 = new Manager("Fatih Tekke",46,"Turkiye","Fatih","2468");
		Manager manager13 = new Manager("Bülent Uygun",53,"Turkiye","bulent","1234");
		Manager manager14 = new Manager("Sami Ugurlu",46,"Turkiye","sami","1234");
		Manager manager15 = new Manager("Ali Camdali",40,"Turkiye","ali","1234");
		Manager manager16 = new Manager("Selcuk Inan",39,"Turkiye","selcuk","1234");
		Manager manager17 = new Manager("Ozhan Pulat",39,"Turkiye","ozhan","1234");
		Manager manager18 = new Manager("Stanimir Stoilov",57,"Bulgaristan","stanimir","1234");
		Manager manager19 = new Manager("Ismet Tasdemir",50,"Turkiye","ismet","1234");
		Manager manager20 = new Manager("Cihat Arslan",54,"Turkiye","cihat","1234");
		
		managerDB.save(manager1);
		managerDB.save(manager2);
		managerDB.save(manager3);
		managerDB.save(manager4);
		managerDB.save(manager5);
		managerDB.save(manager6);
		managerDB.save(manager7);
		managerDB.save(manager8);
		managerDB.save(manager9);
		managerDB.save(manager10);
		managerDB.save(manager11);
		managerDB.save(manager12);
		managerDB.save(manager13);
		managerDB.save(manager14);
		managerDB.save(manager15);
		managerDB.save(manager16);
		managerDB.save(manager17);
		managerDB.save(manager18);
		managerDB.save(manager19);
		managerDB.save(manager20);
	}
}