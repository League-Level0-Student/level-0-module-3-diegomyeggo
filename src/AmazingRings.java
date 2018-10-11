
public class AmazingRings {
	int w;
	int y;
	int h;
	int w2;
	int h2;
	int x;
	int x2;
	void setup() {
	    size(800, 500);
	x=100; 
	x2=600;
	}

	  void draw() {
	background(#E3E0E0);
	w=10;
	h=10;

	    for (int i = 0; i < 15; i++) {
	      noFill();
	      w +=10;
	      h +=10;
	      ellipse(x, 250,w, h);
	      
	    
	  }
	  x=x+1;
	  if(x>600){
	    x=100;
	    x=x-1;
	    
	  }
	  w2=10;
	  h2=10;
	  for (int i = 0; i < 15; i++) {
	      noFill();
	      w2 +=10;
	      h2 +=10;
	      ellipse(x2, 250, w2, h2);
	}
	x2=x2-1;

	if(x2<100){
	 x2=600;
	 x2=x2+1;
	}
	  }
	 

}
