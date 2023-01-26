package dev.egomezfe.climby.model.dto;

import dev.egomezfe.climby.model.Author;
import dev.egomezfe.climby.model.Post;

public record PostDetails(Post post, Author author) { }
