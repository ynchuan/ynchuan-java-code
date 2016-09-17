package JavaWebFilter;

public interface Filter {
	void doFilter(Request req, Response res, ChainFilter cf);
}
