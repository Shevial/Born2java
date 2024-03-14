package AEC1.AEC1_Pruebas;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Prueba2 implements Aeropuerto
 { 

public static void main(String[] args) {

	Prueba2 aeropuerto = new Prueba2();

    // Creamos algunos usuarios
   
    User user3 = new User("Pedro", "67890", "AF456", "45", false);
   

    // Registramos los usuarios en la zona de entrada
  
    aeropuerto.register(user3);
    
  
    
    
    //Fase B Prueba 2 Mandar usuarios a la cola de embarque
   
    aeropuerto.moveUserToBoardingQueue(user3);
    
    
    
    // Imprimimos información sobre las zonas y las colas
    aeropuerto.printWaitingZone();
    aeropuerto.printCommercialZone();
    aeropuerto.printCheckInQueue();
    aeropuerto.printBoardingQueue();
    aeropuerto.printEntranceZone();


}







private LinkedList<User> waitingZone = new LinkedList<>();
private LinkedList<User> EntranceZone = new LinkedList<>();
private LinkedList<User> commercialZone = new LinkedList<>();
private Queue<User> checkInQueue = new LinkedList<>();
private PriorityQueue<User> boardingQueue = new PriorityQueue<>();
public Prueba2(String string, String string2, String string3, String string4, boolean b) {
    
}

public Prueba2() {
    
}

public void register(Prueba2 user1) {


}


public int countUsersInBoardingQueue() {
    return boardingQueue.size();
}

public void register(User user) {
	commercialZone.add(user);
}

public int countUsersInWaitingZone() {
    return waitingZone.size();
}

public int countUsersInEntranceZone() {
    return EntranceZone.size();
}

public int countUsersInCommercialZone() {
    return commercialZone.size();
}

public User getNextUserForCheckIn() {
    return checkInQueue.peek();
}

public User getNextUserForBoarding() {
    return boardingQueue.peek();
}


public void checkIn(User user) {
    if (EntranceZone.remove(user)) {
        checkInQueue.add(user);
    } else {
        throw new IllegalStateException("El usuario no está en la zona de entrada.");
    }
}
public void checkInCompletado(User user) {
    if (checkInQueue.remove(user)) {
        waitingZone.add(user);
    } else {
        throw new IllegalStateException("El usuario no está en la zona de Chek in.");
    }
}
public void board(User user) {
    if (commercialZone.remove(user)) {
        boardingQueue.remove(user);
    } else {
        throw new IllegalStateException("El usuario no esta en la zona comercial.");
    }
}

public void moveUserToCommercialZone(User user) {
    if (waitingZone.remove(user)) {
        commercialZone.add(user);
    } else {
        throw new IllegalStateException("El usuario no está en la zona de espera.");
    }
}
public void addUserToEntranceZone(User user) {
    EntranceZone.add(user);
}

public void moveUserToBoardingQueue(User user) {
    if (commercialZone.remove(user)) {
        boardingQueue.add(user);
    } else {
        throw new IllegalStateException("El usuario no esta en la zona comercial.");
    }
}

public void printWaitingZone() {
    System.out.println("Usuarios en la zona de espera:");
    for (User user : waitingZone) {
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getFlightNumber());
        System.out.println(user.getPassportNumber());
        System.out.println(user.isPregnant() ? "Está embarazada" : "No está embarazada"); // línea adicional
    }
}

public void printCommercialZone() {
    System.out.println("Usuarios en la zona comercial:");
    for (User user : commercialZone) {
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getFlightNumber());
        System.out.println(user.getPassportNumber());
        System.out.println(user.isPregnant() ? "Está embarazada" : "No está embarazada"); // línea adicional
    }
}
public void printEntranceZone() {
    System.out.println("Usuarios en la zona de entrada:");
    for (User user : EntranceZone) {
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getFlightNumber());
        System.out.println(user.getPassportNumber());
        System.out.println(user.isPregnant() ? "Está embarazada" : "No está embarazada"); // línea adicional
    }
        
    
    }


public void printCheckInQueue() {
    System.out.println("Usuarios en la cola de check-in:");
    for (User user : checkInQueue) {
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getFlightNumber());
        System.out.println(user.getPassportNumber());
        System.out.println(user.isPregnant() ? "Está embarazada" : "No está embarazada"); // línea adicional
    }
}

public void printBoardingQueue() {
    System.out.println("Usuarios en la cola de embarque:");
    for (User user : boardingQueue) {
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getFlightNumber());
        System.out.println(user.getPassportNumber());
        System.out.println(user.isPregnant() ? "Está embarazada" : "No está embarazada"); // línea adicional
    }
}

@Override
public void registerUser(String name, String passportNumber, String nationality) {
	// TODO Auto-generated method stub
	
}

@Override
public void checkInUser(String passportNumber, String flightNumber) {
	// TODO Auto-generated method stub
	
}

@Override
public void boardUser(String passportNumber, String flightNumber) {
	// TODO Auto-generated method stub
	
}

@Override
public int getWaitingZoneCount() {
	// TODO Auto-generated method stub
	return 0;
}
public int getEntrnaceZoneCount() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int getCommercialZoneCount() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public String getNextCheckInUser() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getNextBoardingUser() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean canRegisterUser(String passportNumber) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean canCheckInUser(String passportNumber, String flightNumber) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean canBoardUser(String passportNumber, String flightNumber) {
	// TODO Auto-generated method stub
	return false;
}


  

}





