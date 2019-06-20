class Room{
private double width;
private double length;
private int floor;
private Room(){
width=10;
length=12.5;
floor=1;
public double getWidth(){
return width;
}
public void setWidth(newWidth){
if(newWidth<=0){

}
else{
this.width=newWidth;
}
}
public double getLength(){
return length;}
public void setLength(newLength){
if(newLength<=0){
}

else{
this.length=newLength;
}
}
public double getFloor(){
return floor;
}
public void setFloor(int newFloor){
this.floor=newLength;
}
}
}
public Room(){
double this.width;
double this.length;
int this.floor;
this.width=12.5; 
this.length=10;
this.floor=1;

}
public String toString() {
 return String.format( length * width+ "on floor");  
        
    } 


interface comparable{
public CompareTo()
}


class Classroom extends Room{
private int numStudents;
private Classroom(double width,double length,int floor,int numStudents){
this.width=12.5;
this.length=10;
this.floor=1;
this.numStudents;
}
}
}
}

