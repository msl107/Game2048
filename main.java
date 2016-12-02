
	

	import java.util.Random;



public class main {
	private static int cells_X;
	 private static int cells_Y;
	   private static int CELLS ;
	private static Field_of_Game gameField;
	   private static boolean endOfGame; 
	    private static boolean isThere2048; 

	 
	    public static void main(String[] args) {
	        initFields();
	        createCells();

	    }
	    /**
	     * Задаёт значения полей для начала игры
	     */
	    private static void initFields() {
	       
	        endOfGame = false;
	        isThere2048 = false;
	       
	        
	        gameField = new Field_of_Game();
	    }

	    /**
	     * Создаёт на поле начальные ячейки
	     */
	    private static void createCells() {
	    	 
	        for(int i = 0; i < CELLS; i++){
	            generateNewCell();
	        }
	    }
	    private static void win() {
	        endOfGame = true;
	        isThere2048 = true;
	    }
	    
	    
	    private static void generateNewCell() {
	       	               int randomX, randomY;
	       	            int state = new Random().nextInt(100);

	        randomX = new Random().nextInt(cells_X);
	        int currentX = randomX;

	        randomY = new Random().nextInt(cells_Y);
	        int currentY = randomY;



	        boolean placed = false;
	        while(!placed){
	            if(gameField.getState(currentX, currentY) == 0) {
	                gameField.setState(currentX, currentY, state);;
	                placed = true;
	            }else{
	                if(currentX+1 < cells_X) {
	                    currentX++;
	                }else{
	                    currentX = 0;
	                    if(currentY+1 < cells_Y) {
	                        currentY++;
	                    }else{
	                        currentY = 0;
	                    }
	                }
	            } 
	            }
	    }
}
