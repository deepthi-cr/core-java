class ForLoop 
{
public static final String EXECUTION = "Executing forloop";
public static void main(String[] args) {
int a = 10;
System.out.println(a);

for(int i =0; i<1000;i++){
int z = i +1;

System.out.println("EXECUTION" + z);
}
}
}