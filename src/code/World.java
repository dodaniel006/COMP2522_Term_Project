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
        if (countries == null || countries.isEmpty())
        {
            throw new IllegalArgumentException("Countries map cannot be null or empty.");
        }
    }
}
