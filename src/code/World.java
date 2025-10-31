import java.util.HashMap;
import java.util.Map;

/**
 * A class representing a World containing {@link Country} Objects
 * mapped to their respective continent names.
 *
 * @author Daniel Do
 * @version 1.0
 */
final class World
{
    private final Map<Country, String> countries;

    /**
     * Constructor for World Class.
     *
     * @param countries a HashMap of Country objects to their respective continent names
     */
    public World(final Map<Country, String> countries)
    {
        verifyCountries(countries);
        this.countries = countries;
    }

    /*
     * Verifies that the countries map is neither null nor empty and is of type HashMap.
     */
    private static void verifyCountries(final Map<Country, String> countries)
    {
        final String countriesClass;

        if (countries == null || countries.isEmpty())
        {
            throw new IllegalArgumentException("Countries map cannot be null or empty.");
        }

        countriesClass = countries.getClass().getSimpleName();

        if (!countriesClass.equals("HashMap"))
        {
            throw new IllegalArgumentException("Countries map must be of type HashMap.");
        }
    }

    /**
     * Getter for the countries map.
     *
     * @return the countries map
     */
    public Map<Country, String> getCountries()
    {
        return countries;
    }
}
