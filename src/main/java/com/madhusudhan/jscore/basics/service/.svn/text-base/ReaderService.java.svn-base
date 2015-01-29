package com.madhusudhan.jscore.basics.service;

import com.madhusudhan.jscore.basics.readers.IReader;

public class ReaderService {
  private IReader reader = null;

  public ReaderService(IReader reader) {
    this.reader = reader;
  }

  public String fetchData() {
    return reader.read();
  }
}
