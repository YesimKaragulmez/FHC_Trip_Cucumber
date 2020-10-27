package utilities;

import pages.*;

public class AllPage {

    protected HomePage homePage;
    protected Fhc_loginPage loginPage;
    protected UserPage userPage;
    protected Room_Reservation_Page roomReservationPage;
    protected ListOfHotelsPage listOfHotelsPage;
    protected CreateUserPage createUserPage;
    protected ReservationPage reservationPage;

    protected ListOfHotelRoomPage listOfHotelRoomPage;
    protected CreateHotelRoomPage createHotelRoomPage;

    public CreateHotelRoomPage createHotelRoomPage(){
        if (createHotelRoomPage==null){
            createHotelRoomPage=new CreateHotelRoomPage();
        }return createHotelRoomPage;
    }

    public ListOfHotelRoomPage listOfHotelRoomPage(){
        if(listOfHotelRoomPage==null){
            listOfHotelRoomPage=new ListOfHotelRoomPage();
        }return listOfHotelRoomPage;
    }

    public CreateUserPage createUserPage(){
        if(createUserPage == null){
            createUserPage = new CreateUserPage();
        }
        return createUserPage;
    }

    public ReservationPage reservationPage(){
        if(reservationPage == null){
            reservationPage = new ReservationPage();
        }
        return reservationPage;
    }

    public ListOfHotelsPage listOfHotelsPage(){
        if(listOfHotelsPage == null){
            listOfHotelsPage = new ListOfHotelsPage();
        }return listOfHotelsPage;
    }

    public Room_Reservation_Page roomReservationPage(){
        if(roomReservationPage == null){
            roomReservationPage = new Room_Reservation_Page();
        }return roomReservationPage;
    }

    public HomePage homePage(){
        if(homePage == null){
            homePage = new HomePage();
        }return homePage;
    }
    public Fhc_loginPage loginPage(){
        if(loginPage == null){
            loginPage = new Fhc_loginPage();
        }return loginPage;
    }
    public UserPage userPage(){
        if(userPage == null){
            userPage = new UserPage();
        }return userPage;
    }
}
