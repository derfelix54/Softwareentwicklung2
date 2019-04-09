package ComparableVideo;

public class Apple implements Comparable<Apple>{

    private String variety;
    private Color color;
    private int weight;



    public Apple(String variety, Color color, int weight) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
    }



    @Override
    public int compareTo(Apple other) {

        int result = this.variety.compareTo(other.variety);
        if(result == 0) {
            result = this.color.compareTo(other.color);
        }
        if(result == 0) {
            result = Integer.compare(this.weight, other.weight);
        }
        return result;

    }

    public String getVariety() {
        return variety;
    }



    public Color getColor() {
        return color;
    }



    public int getWeight() {
        return weight;
    }


}
