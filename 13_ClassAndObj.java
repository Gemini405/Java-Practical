class rectangle
{
    private int l,b;
    public void setDimension(int x,int y) {
        l=x;
        b=y;
        
    }
    public int area(){
        return l*b;
    }
    public void display(){
        System.out.println("length = " + l);
        System.out.println("breadth = " + b);
    }
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.setDimension(5, 10);
        r.display();
        System.out.println("area = " + r.area());
    }
}
