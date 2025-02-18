

class student{
    String name;
    int id;
    
    public student(String name, int id){
        this.name=name;
        this.id=id;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
}

class regno extends student{
    public regno(String name, int id){
        super(name,id);
    }
    
    public int getregno(){
        return getid()+100;
        
    }
}
class department extends student{
    public department(String name, int id){
        super(name,id);
    }
    public String getdept(){
        if(id>5){
            return "GPC1.0";
        }
        else{
            return "GPC0.0";
        }
    }
}
class manager extends department{
    public manager(String name, int id){
        super(name,id);
    }
    public String getdept(){
        if(id>9){
            return "GPC2.0";
        }
        else{
            return "GPC1.0";
        }
    }
}
public class oopseg{
    public static void main(String[] args){
        regno stu= new regno("Harul",7);
        department dept=new department("Harul",7);
        manager man=new manager("Ganesh",10);
        System.out.println("Student ID: "+stu.getid());
        System.out.println("Student Name: "+stu.getname());
        System.out.println("Student RegID: "+stu.getregno());
        System.out.println("Student Department: "+dept.getdept());
        System.out.println("Manager Department: "+man.getdept());
        
    }
}
