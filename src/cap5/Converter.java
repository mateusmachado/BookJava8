package cap5;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
