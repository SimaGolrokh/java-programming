import java.awt.Color;
public class Main {

    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(25,
                5, TreeType.OAK);

        System.out.println(myFavoriteOakTree.treeType);


        Color myTrunkColor = Tree.TRUNK_COLOR;
        Color myDefaultWhite = Color.WHITE;
        Color myDefaultBlue = Color.BLUE;

        Color brighterBlue = myDefaultBlue.brighter();
    }
}
