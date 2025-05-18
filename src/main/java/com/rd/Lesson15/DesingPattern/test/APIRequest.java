package com.rd.Lesson15.DesingPattern.test;

import lombok.*;

import java.util.List;

@Builder
public class APIRequest{
	private List<DataItem> data;
	private List<IncludedItem> included;

	@Builder
	public static class Relationships{
		private Author author;
	}

	@Builder
	public static class Attributes{
		@Builder.Default
		private String created = "Created";
		private String title;
		private String body;
		private String updated;
		private String gender;
		private String name;
		private int age;
	}

	@Builder
	public static class Author{
		private Data data;
	}

	@Builder
	public static class Data{
		private String id;
		private String type;
	}

	@Builder
	public static class DataItem{
		private Relationships relationships;
		private Attributes attributes;
		private String id;
		private String type;
	}

	@Builder
	public static class IncludedItem{
		private Attributes attributes;
		private String id;
		private String type;
	}
}