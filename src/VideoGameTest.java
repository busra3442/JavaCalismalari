public class VideoGameTest {
    public static void main(String[] args) {

        VideoGame game1 = new VideoGame("CS-GO", 45, 10, gameTypeList.Strategy.valueOf());
        VideoGame game2 = new VideoGame("Lol", 7, 100, gameTypeList.Fighting.valueOf());


        ShoppingSite site = new ShoppingSite("Deep Fun");
        System.out.println("Name of the Game Store : " + site.getStoreName());
        site.addVideoGame(game1);
        site.addVideoGame(game2);
        site.addVideoGame(new VideoGame("Clash of Clans", 5, 200, gameTypeList.Simulation.valueOf()));
        System.out.println("Total game stock of the shopping site: " + ShoppingSite.totalGameStock);
    }
}
