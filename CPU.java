class CPU
{
double price;
CPU(int p)
  {
    price=p;
  }
class Processor
  {
    int cores;
    String manufacturer;
    Processor(int c,String manu)
   {
     cores=c;
     manufacturer=manu;
   }
void display()
{
System.out.println("processor cores:",+cores);
System.out.println("processor manufacurer:",+manufacturer);
}
}
static class RAM
{
int memory;
String manufacturer;
RAM(int m,String manufact)
{
memory=m;
manufacturer=manufact;
}
void disp()
{
System.out.println("RAM memory:" ,+ memory);
System.out.println("RAM manufacturer:",+manufacturer);
}
}
}
public class computer
{
public static void main(String args[])
{
CPU.RAM ramobj=new CPU.RAM(2,"Intel");
ramobj.disp();
CPU cpu=new CPU(30000);
CPU.processor Processor=cpu.new processor(5,"Intel");
Processor.display();
}
}


