class obj_graph
{   double x;
    double y;
    obj_graph(double x,double y)
    {
      this.x=x;
      this.y=y;
    }
    void graph(double x,double y)
    {
        System.out.println( " P(x,y ) :"+this.x+","+this.y);
    }
}
class MainClass2
{
    public static void main(String[] args) {
    graph g1 =new graph();
   
    }
}