public class ShoppingSite {
        public static int totalGameStock;
        private String storeName;
        private int videoGameCount;
        private final VideoGame[] videoGameList = new VideoGame[10];

        public ShoppingSite(String storeName) {
            this.storeName = storeName;
            totalGameStock = 0;
            this.videoGameCount = 0;
        }

        public String getStoreName() {
            return this.storeName;
        }
        public void addVideoGame(VideoGame game) {
            videoGameList[this.videoGameCount] = game;
            this.videoGameCount++;
            totalGameStock += game.getGameStock();
            System.out.println("************************************************");
            System.out.println("Name of the game: " + game.getGameName());
            System.out.println("Price of the game: $" + game.getGamePrice());
            System.out.println("Type of the game: " + game.getGameType());
            System.out.println("Stock of the game: " + game.getGameStock());
        }
    }

