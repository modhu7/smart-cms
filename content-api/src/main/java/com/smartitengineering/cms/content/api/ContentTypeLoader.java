/*
 *
 * This is a simple Content Management System (CMS)
 * Copyright (C) 2009  Imran M Yousuf (imyousuf@smartitengineering.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.smartitengineering.cms.content.api;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

/**
 * The API for loading all DTOs related to {@link ContentType}. It will also
 * provide the editable versions of those DTOs.
 * @author imyousuf
 * @since 0.1
 */
public interface ContentTypeLoader {

		/**
		 * Loads the content type definition specified by the content type ID.
		 * @param contentTypeID The id of content type to retrieve.
		 * @return Content type represented by the parameter. Null if no such type
		 *					exists.
		 * @throws NullPointerException If contentTypeID parameter is null
		 */
		public ContentType loadContentType(ContentTypeID contentTypeID)
						throws NullPointerException;

		/**
		 * Parse a {@link File} to retrieve the content type definitions. The format
		 * of the file should be specified by the implementor.
		 * @param contentTypeDefinition File to parse for content type definitions.
		 * @return Return ordered collection of parsed content types. Could be empty
		 *					but never null.
		 * @throws NullPointerException If contentTypeDefinition is null
		 * @throws IOException If there is any error during parsing.
		 */
		public Collection<MutableContentType> parseContentTypes(
						File contentTypeDefinition)
						throws NullPointerException,
									 IOException;

		/**
		 * Get the mutable version of the textual content type.
		 * @param contentType Content type to get the mutable version for
		 * @return Editable textual content type
		 */
		public MutableTextualContentType getMutableTextualContentType(
						TextualContentType contentType);

		/**
		 * Get the mutable version of the binary content type.
		 * @param contentType Content type to get the mutable version for
		 * @return Editable binary content type
		 */
		public MutableBinaryContentType getMutableBinaryContentType(
						BinaryContentType contentType);

		/**
		 * Get the mutable version of the content data type.
		 * @param contentDataType Content data type to get the mutable version for
		 * @return Editable content data type
		 */
		public MutableContentDataType getMutableContentDataType(
						ContentDataType contentDataType);

		/**
		 * Get the mutable version of the collection data type.
		 * @param collectionDataType Collection data type to get the mutable one for
		 * @return Editable collection data type
		 */
		public MutableCollectionDataType getMutableCollectionDataType(
						CollectionDataType collectionDataType);

		/**
		 * Get the mutable version of the content status
		 * @param contentStatus Content status to get the mutable version for
		 * @return Editable content status
		 */
		public MutableContentStatus getMutableContentStatus(
						ContentStatus contentStatus);

		/**
		 * Get the mutable version of the content type ID
		 * @param contentTypeID content type id to get the mutable version for
		 * @return Editable content type id
		 */
		public MutableContentTypeID getMutableContentTypeID(
						ContentTypeID contentTypeID);

		/**
		 * Get the mutable version of the field definition
		 * @param fieldDef Field definition to get the mutable version for
		 * @return Editable field definition
		 */
		public MutableFieldDef getMutableFieldDef(FieldDef fieldDef);

		/**
		 * Create a new editable collection data type
		 * @return New collection data type
		 */
		public MutableCollectionDataType createMutableCollectionDataType();

		/**
		 * Create a new editable content data type
		 * @return New content data type
		 */
		public MutableContentDataType createMutableContentDataType();

		/**
		 * Create a new editable content status
		 * @return
		 */
		public MutableContentStatus createMutableContentStatus();

		/**
		 * Create a new editable content type id.
		 * @return New content type id
		 */
		public MutableContentTypeID createMutableContentTypeID();

		/**
		 * Create a new editable field definition
		 * @return New field definition
		 */
		public MutableFieldDef createMutableFieldDef();

		/**
		 * Create a editable textual content type
		 * @return new textual content type
		 */
		public MutableTextualContentType createMutableTextualContentType();

		/**
		 * Create a editable binary content type
		 * @return New binary content type
		 */
		public MutableBinaryContentType createMutableBinaryContentType();
}
