package FoodMake;

class Player
{
	private String nickname;
    private int points;

    public Player(String nickname) {
        this.nickname = nickname;
        this.points = 0;
    }

    public String getNickname() {
        return nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

