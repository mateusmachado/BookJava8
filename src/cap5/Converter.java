package cap5;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
