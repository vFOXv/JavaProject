package com;

public enum Thing {

    BOOK() {
        @Override
        public String toString() {
            return "BOOK";
        }
    },
    COPY_BOOK{
        @Override
        public String toString() {
            return "COPY_BOOK";
        }
    },
    PEN{
        @Override
        public String toString() {
            return "PEN";
        }
    },
    PENCIL{
        @Override
        public String toString() {
            return "PENCIL";
        }
    }
}
