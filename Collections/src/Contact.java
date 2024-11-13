class Contact {
    private String name;
    private String phone;
    //  hadji    123
    public Contact (String name, String phone) {
        this.name = name;  //hadji
        this.phone = phone; //123

    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    @Override
    public String toString(){
        return "Contact[Name: "+name+ ", Phone "+phone+"]";
    }

}
