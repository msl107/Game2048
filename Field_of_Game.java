


public class Field_of_Game {
	

	/**
	 * ������ � �������� ��������� �������� ����
	 *
	 * @author DoKel
	 * @version 1.0
	 */ private static int cells_X;
	 private static int cells_Y;
	    /**
	     * ��������� ���� ����� ����.
	     */
	    private int[][] theField;

	    /**
	     * �������������� ���� � ��������� ��� ������
	     */
	    public Field_of_Game(){
	        theField = new int[cells_X][cells_Y];

	        for(int i=0; i<theField.length;i++){
	            for(int j=0; j<theField[i].length; j++){
	                theField[i][j]=0;
	            }
	        }
	    }

	    /**
	     * ���������� ��������� ������ ���� �� �����������
	     *
	     *  x ���������� ������ X
	     * @ y ���������� ������ Y
	     * return ��������� ��������� ������
	     */
	    public int getState(int x, int y){
	        return theField[x][y];
	    }
	    /**
	     * �������� ��������� ������ ���� �� �����������
	     *
	     * @param x ���������� ������ X
	     * @param y ���������� ������ Y
	     * @param state ����� ��������� ��� ���� ������
	     */
	    public void setState(int x, int y, int state){
	          theField[x][y] = state;
	    }

	    /**
	     * �������� ������� ��� ������� i
	     *
	     * @param i ����� ����������� �������
	     * @param newColumn ������ ����� ��������� ����� �������
	     */
	    public void setCol(int i, int[] newCol) {
	        theField[i] = newCol;
	    }

	    /**
	     * ���������� ������ ��������� ����� ������� ��� ������� i
	     *
	     * @param i ����� �������������� �������
	     * @return ������ ��������� ����� �������
	     */
	    public int[] getCol(int i) {
	        return theField[i];
	    }

	    /**
	     * �������� ������ ��� ������� i
	     *
	     * @param i ����� ���������� ������
	     * @param newLine ������ ����� ��������� ����� ������
	     */
	    public void setLine(int i, int[] newLine) {
	        for(int j = 0; j< cells_X; j++){
	            theField[j][i] = newLine[j];
	        }
	    }

	    /**
	     * ���������� ������ ��������� ����� ������ ��� ������� i
	     *
	     *  i ����� ������������� ������
	     * @return ������ ��������� ����� ������
	     */
	    public int[] getLine(int i) {
	        int[] ret = new int[cells_X];

	        for(int j = 0; j< cells_X; j++){
	            ret[j] = theField[j][i];
	        }

	        return ret;
	    }

		

	
		}


