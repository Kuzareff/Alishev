package lesson27;

import lesson27.Forest.Squirell; //Также импортировался.
import lesson27.Forest.Tree; //Импорт классов из другого пакета
// Но можно сразу импортировать все содержиоме пакета если указать import lesson27.Forest.*


public class Lesson27 {

    public void runLes27 () {
        Tree tree = new Tree();
        Squirell squirell = new Squirell();

        tree.runTree();
        squirell.runSq();

    }
}
