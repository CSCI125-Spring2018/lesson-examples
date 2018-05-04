package week15;

interface Builder<T>
{
    Builder<T> reset();
    T build();
}