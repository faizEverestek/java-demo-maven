/*
---------------------------------------------------------------------------------------------
 EVERESTEK
 Herndon, VA

 (c) Copyright EVERESTEK Corporation.
 ALL RIGHTS RESERVED

 The software and information contained herein are proprietary to, and comprise valuable
 trade secrets of, EVERESTEK Corporation, which intends to preserve as trade secrets such
 software and information. This software should only be furnished subject to a written
 license agreement and may only be used, copied, transmitted, and stored in accordance
 with the terms of such license and with the inclusion of the above copyright notice.
 If there is no written License Agreement between you and EVERESTEK Corporation, then you
 have received this software in error and should be returned to EVERESTEK Corporation or
 destroyed immediately, and you should also notify EVERESTEK Corporation. This software and
 information or any other copies thereof may not be provided or otherwise made available
 to any person who is not authorized to receive it pursuant to a written license Agreement
 executed with EVERESTEK Corporation.
---------------------------------------------------------------------------------------------
*/

package com.everestek.hub.pet.api;

import com.everestek.hub.pet.dto.Error;
import com.everestek.hub.pet.dto.Pet;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

@Generated("v1.0.0")
@Validated
@Tag(name = "pets", description = "the pets API")
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public interface PetsApi {

    /**
     * Returns an {@link Optional} containing the current {@link NativeWebRequest}.
     *
     * <p>By default, this implementation returns an empty {@link Optional}. Subclasses may override this method to
     * provide a non-empty {@link Optional} containing the actual {@link NativeWebRequest} if available.
     *
     * @return an {@link Optional} containing the current {@link NativeWebRequest} if available, otherwise an empty
     *     {@link Optional}
     */
    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /pets : Create a pet.
     *
     * @param pet (required)
     * @return Null response. (status code 201) or unexpected error, (status code 200)
     */
    @Operation(
            operationId = "createPets",
            summary = "Create a pet.",
            tags = {"pets"},
            responses = {
                @ApiResponse(responseCode = "201", description = "Null response."),
                @ApiResponse(
                        responseCode = "default",
                        description = "unexpected error,",
                        content = {
                            @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = Error.class))
                        })
            })
    @PostMapping(
            value = "/pets",
            produces = {"application/json"},
            consumes = {"application/json"})
    default ResponseEntity<Void> createPets(
            @Parameter(name = "Pet", description = "", required = true) @Valid @RequestBody Pet pet) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /pets : List all pets.
     *
     * @param limit How many items to return at one time (max 100). (optional)
     * @return A paged array of pets. (status code 200) or unexpected error. (status code 200)
     */
    @Operation(
            operationId = "listPets",
            summary = "List all pets.",
            tags = {"pets"},
            responses = {
                @ApiResponse(
                        responseCode = "200",
                        description = "A paged array of pets.",
                        content = {
                            @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = Pet.class)))
                        }),
                @ApiResponse(
                        responseCode = "default",
                        description = "unexpected error.",
                        content = {
                            @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = Error.class))
                        })
            })
    @GetMapping(
            value = "/pets",
            produces = {"application/json"})
    default ResponseEntity<List<Pet>> listPets(
            @Parameter(
                            name = "limit",
                            description = "How many items to return at one time (max 100).",
                            in = ParameterIn.QUERY)
                    @Valid
                    @RequestParam(required = false)
                    Integer limit) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /pets/{petId} : Info for a specific pet.
     *
     * @param petId The id of the pet to retrieve. (required)
     * @return Expected response to a valid request. (status code 200) or unexpected error. (status code 200)
     */
    @Operation(
            operationId = "showPetById",
            summary = "Info for a specific pet.",
            tags = {"pets"},
            responses = {
                @ApiResponse(
                        responseCode = "200",
                        description = "Expected response to a valid request.",
                        content = {
                            @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = Pet.class))
                        }),
                @ApiResponse(
                        responseCode = "default",
                        description = "unexpected error.",
                        content = {
                            @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = Error.class))
                        })
            })
    @GetMapping(
            value = "/pets/{petId}",
            produces = {"application/json"})
    default ResponseEntity<Pet> showPetById(
            @Parameter(
                            name = "petId",
                            description = "The id of the pet to retrieve.",
                            required = true,
                            in = ParameterIn.PATH)
                    @PathVariable
                    String petId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
