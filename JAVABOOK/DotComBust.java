import java.util.*; 
import java.io.*;
class GameHelper {
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int [] grid = new int[gridSize];
	private int comCount = 0;

	public String getUserInput(String prompt) {
	       String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) return null;
		} catch (IOException e) {
			System.out.println("IOExeption: " + e);
		}
		return inputLine.toLowerCase();
	}

	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String>alphaCells = new ArrayList<String>();
		String [] alphacoords = new String [comSize];
		String temp = null;
		int  []  coords = new int[comSize];
		int attempts = 0;
		boolean success = false;
		int location = 0;

		comCount++;
		int incr = 1;
		if((comCount % 2) == 1) {
			incr = gridLength;
		}

		while( !success & attempts < 200 ) {
			location = (int) (Math.random() * gridSize);
			
			int x = 0;
			success = true;
			while (success && x < comSize) {
				if(grid[location] == 0) {
					coords[x++] = location;
					location += incr;
					if (location >= gridSize) {
						success = false;
					}
					if(x > 0 && (location % gridLength == 0)) {
						success = false;
					}
				} else {
					success = false;
				}
			}
		}

		int x = 0;
		int row = 0;
		int column = 0;
		while (x < comSize) {
			grid[coords[x]] = 1;
			row =  (int) (coords[x] / gridLength);
			column = coords[x] % gridLength;
			temp = String.valueOf(alphabet.charAt(column));

			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
		}
		return alphaCells;
	}
}


		



 
class DotCom {
	private ArrayList<String> locationCells;
	private String name;
	
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public void setName(String n) {
		name = n;
	}

	public String checkYourself(String userInput) {
		String result = "missed";
	
		int index = locationCells.indexOf(userInput);
		
		if(index>= 0) {
			locationCells.remove(index);
			
			if(locationCells.isEmpty()){
				result = "sinked";
			}else {
				result  = "Hit";
			}
		}
		return result;
	}
}
public class DotComBust {
	
	// обьевляем и инициализируем переменные который нам понадобятся
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int  numOfGuess = 0;

	private void setUpGame() {
		// Create seviral sites and give their names 
		//Cоздаем три обьекта DotCom даем им имена и перемещяем их в ArrayList 
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("google.com");
		DotCom three = new DotCom();
		three.setName("eToys.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
	
		//Выводим краткие инструкции для пользователй
		System.out.println("Your goul is sink out three sites.");
		System.out.println("Pets.com, google.com, eToys.com");
		System.out.println("Try to sink out all the sites with the minimum number of attempts");
		
		
		for (DotCom dotComToSet : dotComsList) {// повторяем с каждым обьектом в списке
			ArrayList<String> newLocation = helper.placeDotCom(3);
			//Запрашиваем у вспомогательного обекта адрес сайта
			dotComToSet.setLocationCells(newLocation);
			//Вызываем сеттер из DotCom чтобы передать местоположение которое получил
		}
	}
	
	private void startPlayGame() {
		while(!dotComsList.isEmpty()) { // Дот тех пор пока список DotCom не станет пустым
			String userGuess = helper.getUserInput("make a move");
			//Получаем пользовательский ввод
			checkUserGuess(userGuess); // Вызываем метод checkUserGuess
		}
		finishGame();//выываем метод finishGame
	}

	private void  checkUserGuess (String userGuess) {
		//Инкрементируем количество попыток которые сделал пользователь
		numOfGuess++;
		//Подразумеваем промах пока не выясним обратного
		String result = "missed";
		
		//Повторяем это для всех игровых обектов
		for (DotCom dotComToTest : dotComsList) {
			
			result = dotComToTest.checkYourself(userGuess);
                        //Просим DotCom проверить ход пользователя ищем поподение 
			if(result.equals("hit"))  { 
				break;//Выбираемся из цикла раньше времени 
			}
                        //Просим DotCom проверить ход пользователя ищем потопление
			if(result.equals("sinked")){
				//Ему пришол конец так что удаляем его из списка сайтов
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);//Выводим для пользователя результат
	}

	private void finishGame() {
		//Выводим пользователю собшение о том как он прошол игру
		System.out.println("All sites is done! All money in the sea");
		if(numOfGuess <=18) {
			System.out.println("You moved " + numOfGuess + " times");	
			System.out.println("Congradulation you can keep your money");
		} else {
			System.out.println("You moved " + numOfGuess + " times");
			System.out.println(" and the sea take our money");
		}
	}


	public static void main (String[] args) {
		//Создаем игровой обьект
		DotComBust game = new DotComBust();
		//Говарим игровому обьекту подготовить игру
		game.setUpGame();
		//Говарим игровому обекту начать главный игровой цикл
		game.startPlayGame();
	}
}

























