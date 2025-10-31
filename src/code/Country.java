final class Country
{
    private final String   name;
    private final String   capitalCityName;
    private final String[] facts;

    public Country(final String name,
                   final String capitalCityName,
                   final String[] facts)
    {
        verifyString(name);
        verifyString(capitalCityName);
        verifyString(facts);

        this.name            = name;
        this.capitalCityName = capitalCityName;
        this.facts           = facts;
    }

    /*
     * Verifies that a string is neither null nor blank.
     */
    private static void verifyString(final String str)
    {
        if (str == null || str.isBlank())
        {
            throw new IllegalArgumentException("String cannot be null or blank.");
        }
    }

    /*
     * Verifies that each string in an array is neither null nor blank.
     */
    private static void verifyString(final String[] str)
    {
        for (int i = 0; i < str.length; i++)
        {
            verifyString(str[i]);
        }
    }
}
