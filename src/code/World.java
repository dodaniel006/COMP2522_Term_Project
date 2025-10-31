import java.util.HashMap;
import java.util.Map;

final class World
{
    private final Map<Country, String> countries;

    public World(final Map<Country, String> countries)
    {
        verifyCountries(countries);
        this.countries = countries;
    }

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

    public Map<Country, String> getCountries()
    {
        return countries;
    }
}
