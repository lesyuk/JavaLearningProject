package chapter3;
// Напишите программу, которая получает символы, введенные с клавиатуры, до тех пор, пока не встретится точка.
// Предусмотрите в программе счетчик пробелов. Сведения о количестве пробелов должны выводиться в конце программы.
public class SpaceCounter {
    public static void main(String[] args) throws java.io.IOException {
        char userInput;
        int spaceCounter = 0;

        do {
            userInput = (char) System.in.read();
            if(userInput == ' ') spaceCounter++;
        } while(userInput != '.');
        System.out.println("Количество пробелов: " + spaceCounter);
    }
}
