public enum gameTypeList {
        Sports("Sports", 0),
        Strategy("Strategy",1),
        Simulation("Simulation", 2),
        Fighting("Fighting", 3),
        Adventure("Adventure",4),
        Racing("Racing", 5),
        Puzzle("Puzzle", 6);

        private String gameTypeList;
        private int ID;

        gameTypeList(String gameTypeList, int ID){
            this.gameTypeList = gameTypeList;
            this.ID = ID;
        }

        public String valueOf() {
            return gameTypeList;
        }

    }

