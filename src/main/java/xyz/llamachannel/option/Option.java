package xyz.llamachannel.option;

public sealed interface Option<T> permits Some, None {
  public boolean isSome();
  public boolean isNone();
  public T unwrap();
}
