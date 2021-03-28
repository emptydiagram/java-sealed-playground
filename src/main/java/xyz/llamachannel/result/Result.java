package xyz.llamachannel.result;

public sealed interface Result<T, E> permits Ok, Err {
  public boolean isOk();
  public boolean isErr();
  public T unwrap();
  public E unwrapErr();
}