package com.yoon.oas;

import io.swagger.v3.oas.models.media.Schema;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.languages.SpringCodegen;

public class SpringKidsworldAPIGenerator extends SpringCodegen {


    public SpringKidsworldAPIGenerator() {
        super();
        templateDir = "spring-kidsworld-api";
    }

    @Override
    public String getName() {
        return "spring-kidsworld-api";
    }

    @Override
    public void processOpts() {
        super.processOpts();
        // imports for pojos
        importMapping.remove("ApiModelProperty");
        importMapping.remove("ApiModel");
    }

    @Override
    public CodegenModel fromModel(String name, Schema model) {
        super.fromModel(name, model);
        CodegenModel codegenModel = super.fromModel(name, model);
        codegenModel.imports.remove("ApiModel");
        codegenModel.imports.remove("ApiModelProperty");
        return codegenModel;
    }


}