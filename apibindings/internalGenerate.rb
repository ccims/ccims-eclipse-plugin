require 'graphql_java_gen'
require 'graphql_schema'
require 'json'

schemaFile = File.read(ARGV[0])
schema = GraphQLSchema.new(JSON.parse(schemaFile))

GraphQLJavaGen.new(schema,
  package_name: "de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings",
  nest_under: 'Schema', # Not used, but must be defined
).save_granular(ARGV[1])
