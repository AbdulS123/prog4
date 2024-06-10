package at.ac.fhcampuswien.fhmdb.BuilderPattern;

import at.ac.fhcampuswien.fhmdb.models.Genre;

public class MovieAPIRequestBuilder {
    private static final String DELIMITER = "&";
    private final StringBuilder url;

    public MovieAPIRequestBuilder(String base) {
        this.url = new StringBuilder(base);
    }

    public MovieAPIRequestBuilder query(String query) {
        appendParameter("query", query);
        return this;
    }

    public MovieAPIRequestBuilder genre(String genre) {
        appendParameter("genre", genre);
        return this;
    }

    public MovieAPIRequestBuilder genre(Genre genre) {
        appendParameter("genre", genre != null ? genre.toString() : null);
        return this;
    }

    public MovieAPIRequestBuilder releaseYear(String releaseYear) {
        appendParameter("releaseYear", releaseYear);
        return this;
    }

    public MovieAPIRequestBuilder ratingFrom(String ratingFrom) {
        appendParameter("ratingFrom", ratingFrom);
        return this;
    }

    private void appendParameter(String key, String value) {
        if (value != null && !value.isEmpty()) {
            if (url.indexOf("?") == -1) {
                url.append("?");
            } else if (url.charAt(url.length() - 1) != '?' && url.charAt(url.length() - 1) != DELIMITER.charAt(0)) {
                url.append(DELIMITER);
            }
            url.append(key).append("=").append(value);
        }
    }

    public String build() {
        return url.toString();
    }
}
