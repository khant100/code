package DSACCodingInt.Recursion;


/**
 *
 * Problem: Implement the "paint fill" function that one might see on many image
 * editing programs. That is, given a screen(represented by a two-dimensional
 * array of colors), a point, and a new color, fill in the surrounding area
 * until the color changes from the original color.
 *
 */

enum Color{
    Black,White,Red;
}
public class PaintFill {

    public boolean FillColour(Color[][] screen,int col, int raw,Color nColor){
        if(screen[raw][col]==nColor){
            return false;
        }
        return fill(screen,raw,col,screen[raw][col],nColor);

    }

    public boolean fill(Color[][] screen,int raw,int col,Color ocoler,Color ncoler){
        if(raw>screen.length||raw<0||col<0||col>screen[raw].length){
            return false;
        }
        if(screen[raw][col]==ocoler) {
            screen[raw][col]=ncoler;
            fill(screen, raw +1,col,ocoler,ncoler);
            fill(screen, raw, col + 1,ocoler, ncoler);
            fill(screen,  raw, col,  ocoler,  ncoler);
            fill(screen,  raw,  col,  ocoler, ncoler);
        }
        return true;

    }




}
