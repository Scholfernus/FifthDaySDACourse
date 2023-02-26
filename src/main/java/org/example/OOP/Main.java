package org.example.OOP;

public class Main {
    public static void main(String[] args) {


        Telefon phone = new Telefon(555, "Samsung", 0.845);
        Telefon phone2 = new Telefon(5639, "Iphone", 0.345);
        Telefon phone3 = new Telefon(9786, "Xiaomi", 0.450);

        String phone1Data = phone.toString();
        System.out.println(phone1Data);
        String phone2Data = phone2.toString();
        System.out.println(phone2Data);
        String phone3Data = phone3.toString();
        System.out.println(phone3Data);
        phone.receiveCall(265_598_365 );
        phone3.receiveCallName("Jacek");
        System.out.println("Twój numer telefonu: " + phone2.getNumber());

        phone2.setNumber(789_987_456);

        Telefon phone5 = new Telefon(8790,"Oppo",0.765);
        System.out.println(phone5);
        Telefon phone6 = new Telefon(87655,"Huawei");
        System.out.println(phone6);
        phone6.receiveCall("Joanna", 876_987_654);

        phone6.sendMesage(765987776, 564784904,673927384,982734532);


    }

}
