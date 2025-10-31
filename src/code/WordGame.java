class WordGame
{
    private final World triviaWorld;

    public WordGame(final World triviaWorld)
    {
        verifyWorld(triviaWorld);
        this.triviaWorld = triviaWorld;
    }

    private static void verifyWorld(final World triviaWorld)
    {
        if (triviaWorld == null)
        {
            throw new IllegalArgumentException("World cannot be null.");
        }
    }

    public void play()
    {
        System.out.printf("Welcome to the word game! You will be asked %d questions.\n",
                          triviaWorld.getCountries().size());
    }
}
