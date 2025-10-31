/**
 * A class representing a country with its name, capital city, and interesting facts.
 *
 * @author Daniel Do
 * @version 1.0
 */
final class Country
{
    private final String   name;
    private final String   capitalCityName;
    private final String[] facts;

    /**
     * Constructor for Country Class.
     *
     * @param name the name of the country
     * @param capitalCityName the capital city of the country
     * @param facts an array of interesting facts about the country
     */
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
