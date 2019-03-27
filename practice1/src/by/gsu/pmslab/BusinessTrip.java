package by.gsu.pmslab;

public class BusinessTrip {
    private static final int DAILY_RATE = 2250;
    private String account;
    private int transport;
    private int days;

    public BusinessTrip(){
        this.account = null;
        this.transport = 0;
        this.days = 0;
    }

    public BusinessTrip(String account, int transport, int days){
        this.account = account;
        this.transport = transport;
        this.days = days;
    }

    public String getAccount(){
        return account;
    }
    public void setAccount(String account){
        this.account = account;
    }

    public int getTransport(){
        return transport;
    }
    public void setTransport(int transport){
        this.transport = transport;
    }

    public int getDays(){
        return days;
    }
    public void setDays(int days){
        this.days = days;
    }

    public int getTotal(){
        return transport + DAILY_RATE * days;
    }

    public void show(){
        System.out.println("rate = "+Converter.convert(DAILY_RATE,100,2)+"\naccount = "
                +account+"\ntransport = "+Converter.convert(transport,100,2)+"\ndays = "
                +days+"\ntotal = "+Converter.convert(getTotal(),100,2));
    }

    @Override
    public String toString(){
        return Converter.convert(DAILY_RATE,100,2)+";"+account+";"
                +Converter.convert(transport,100,2)+";"+days+";"+Converter.convert(getTotal(),100,2);
    }
}
