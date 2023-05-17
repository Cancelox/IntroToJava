import java.util.List;

public class Dog {
        private int age;
        private String owner;
        private String breed;
        
        //a
        public Dog() {
        	
        }
        
        public Dog(int a, String o, String b) {
        	age = a;
        	owner = o;
        	breed = b;
        }
        
        //b
        public boolean hasSameOwner(Dog a, Dog b) {
        	return a.owner == b.owner;
        }
        
        //c
        public static double avgAge(List<Dog> l) {
        	int sum = 0;
        	for(int i = 0; i < l.size(); i++) {
        		sum += l.get(i).age;
        	}
        	return sum/l.size();
        	
        }
        
        // d
        public int getAge() {
        	return age;
        }
        
        public void setAge(int a) {
        	age = a;
        }
        
        public String getOwner() {
        	return owner;
        }
        
        public void setOwner(String o) {
        	owner = o;
        }
        
        public String getBreed() {
        	return breed;
        }
        
        public void setBreed(String b) {
        	breed = b;
        }
        
        //e
        public String toString() {
        	return breed + ": Owner: " + owner + ", Age: " + age;
        }
        
        
        public static void main(String[] args) {
        		//f
        		Dog d = new Dog(8, "Dexter Morgan", "Corgi");
                
                Dog[] dogs = new Dog[5];
                dogs[0] = new Dog(4, "Stephen Colbert", "Boxer");
                
        }
}